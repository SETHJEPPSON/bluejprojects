
public class Funday
{
    public static void main(){
        int dayOfWeek = 3;
        //int year = 1;

        int day;
        int funday = 0;

        for(int year = 1; year < 101; year++){
            for(int month = 1; month < 13; month++){
                day = 1;
                if(month == 4 || month == 6 || month == 9 || month == 11){
                    //for(int i = 1; i < 31; i++){
                    if(dayOfWeek == 1){
                        funday++;
                    }
                    dayOfWeek+=2;

                    if(dayOfWeek > 7){
                        dayOfWeek -= 7;
                    }
                    //}
                }
                else if(month != 4 || month != 6 || month != 9 || month != 11 || month != 2){
                    //for(int k = 1; k < 32; k++){
                    if(dayOfWeek == 1){
                        funday++;
                    }
                    dayOfWeek+=3;
                    if(dayOfWeek > 7){
                        dayOfWeek -= 7;
                    }
                    //}
                }
                else{
                    //for(int l = 1; l < 29; l++){
                    if(dayOfWeek == 1){
                        funday++;
                    }
                    if((year % 4) == 0&&(year % 400) != 0){
                        dayOfWeek+=1;
                        if(dayOfWeek > 7){
                            dayOfWeek -= 7;
                        }
                    }
                    //}
                }
            }
        }
        System.out.println("The number of days are " + funday);
    }
}
