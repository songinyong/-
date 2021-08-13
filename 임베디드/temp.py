# -*- coding: utf-8import requests; from urllib.parse import urlparse

         -*-

import requests; from urllib.parse import urlparse
from urllib.request import urlopen
import pandas as pd

import re
import time

while(1):
    day =time.strftime('%Y%m%d', time.localtime(time.time()))

    hour=time.strftime('%H00', time.localtime(time.time()))
    cal_hour=time.strftime('%H', time.localtime(time.time()))
    
    if(int(cal_hour)<10):
        hour ="0"+str(int(cal_hour)-1)+"00"
    else:
        hour =str(int(cal_hour)-1)+"00"
    url = "http://apis.data.go.kr/1360000/VilageFcstInfoService/getUltraSrtNcst?serviceKey=&numOfRows=10&dataType=JSON&pageNo=1&base_date={}&base_time={}&category=PTY&nx=55&ny=127".format(day,hour)



    req = requests.get(url) 
    json = req.json()
    max = len(json['response']['body']['items']['item'])

#not raining: 0 else 1~6
    for i in range(0,max):
    
        if(json['response']['body']['items']['item'][i]['category']=='PTY'):
            pty = json['response']['body']['items']['item'][i]['obsrValue']
            print(pty)
            f = open("test.txt", 'w')
            f.write(pty)
            f.close()
    time.sleep(60*10)