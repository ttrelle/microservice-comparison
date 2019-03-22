LOG=startup.log
N=$1

echo "Doing $N iteration/s ..."

# start / stop application several times
if [ -f $LOG ]; then rm $LOG; fi
for i in `seq 1 $N`; do
    #java -jar target/spring-boot-web-demo-0.0.1.jar >> $LOG &
    java -noverify -jar target/spring-boot-web-demo-0.0.1.jar >> $LOG &
    PID=$!
    sleep 6
    kill $PID
done

# calculate mean startup time
sum=0;
count=0;
for i in $(awk 'match($0, /in (.+) seconds/) {print substr($0, RSTART+3, RLENGTH-11)}' $LOG); do
    sum=$(echo $sum+$i | bc)
    ((count++))
done
echo "scale=4; $sum / $count" | bc