package WiseSaying;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        App app = new App();

        System.out.println("== 명언 앱 ==");

        while(true){

            System.out.print("명령) ");
            String cmd =  sc.nextLine().trim();

            if(cmd.equals("종료")){
                break;
            }
            else if(cmd.equals("등록")){
                app.registering();
            }
            else if(cmd.equals("삭제")){

                app.deleting(extNum(cmd));
            }
            else if(cmd.equals("목록")){
                app.listing();
            }
            else if(cmd.equals("수정")){
                app.modifing(extNum(cmd));
            }
        }
        sc.close();
    }

    public static Integer extNum(String cmd){
        return Integer.parseInt(cmd.substring(5));
        //parseInt는 Integer클래스의 정적 메서드이기 때문에 앞에 Integer를 붙여야한다.
    }
}


