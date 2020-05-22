#!/bin/bash

for ((i=1;i<=99;i++));
do
    let suffix;
    if [ $i -lt 10 ];then
        suffix="00"$i;
    else
        suffix="0"$i;
    fi
    filename="Red.Dead.Redemption.2.7z."$suffix;
    echo $filename;
    curl http://110.43.205.1:9000/${filename} -o ${filename};
done