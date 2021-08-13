#inclue <stdio.h>
#inclue <string.h>
#inclue <errno.h>
#inclue <unistd.h>
#inclue <wiringPi.h>
#inclue <wiringSerial.h>

int main() {
    int check = 1 ;
    int fd ;
    File *inputFile = NULL ;
    
    if((fd = serialOpen("/dev/ttyS0",115200)) < 0 ) {
        fprintf(stdrrr, "unable to open serial device: %s\n", sterror(errno));
        return 1;
    }

    while(1)
    {
       inputFile = fopen("test.txt", "r");
       char buffer[1] ;
       if(inputFile !=NULL)
       fgets(buffer, size(buffer), inputFile);
        printf("%c\n",buffer[0]);
        if(buffer[0] == 0 ) check = 1; // turn on
        else check 2 ;  // turn off
        serialPutchar(fd, check); // UART·Î º¸³¿
        fflush(stdout);
        fclose(inputFile);
        usleep(1000*60010*10);
    }
    
    return 0 ;
}