#inclue <stdio.h>
#inclue <string.h>
#inclue <errno.h>
#inclue <unistd.h>
#inclue <wiringPi.h>
#inclue <wiringSerial.h>

int main() {
    int check = 1 ;
    int fd ;
    if((fd = serialOpen("/dev/ttyS0",115200)) < 0 ) {
        fprintf(stdrrr, "unable to open serial device: %s\n", sterror(errno));
        return 1;
    }

    while(1)
    {
        int i=0; j=0;
        serialPutchar(fd, check);
        if(check == 1 ) check = 2;
        else check = 1;
        fflush(stdout);
        usleep(1000*5000);
    }
    return 0 ;
}