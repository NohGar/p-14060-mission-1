package WiseSaying;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private List<WiseSaying> ws = new ArrayList();
    private Integer number = 0;

    public void registering(){
        Scanner sc = new Scanner(System.in);

        System.out.print("명언: ");
        String text = sc.nextLine().trim();

        System.out.print("작가 : ");
        String author = sc.nextLine().trim();

        number++;
        ws.add(new WiseSaying(author,number,text));
        System.out.println(number + "번 명언이 등록되었습니다.");
    }

    public void listing(){
        System.out.println("번호 / 작가 / 명언");
        System.out.println("--------------------");

        for(int i = ws.size()-1; i >= 0; i--){
            WiseSaying w = ws.get(i);
            System.out.println(w.number + " / " + w.author + " / " + w.text );
        }
    }

    public void deleting(Integer number){
        boolean det = false;

        for(WiseSaying w : ws){
            if(w.number == number){
                ws.remove(w);
                det = true;
                System.out.println(number + "번 명언은 삭제되었습니다.");
            }
        }
        if(!det){
            System.out.println(number + "번 명언은 존재하지 않습니다.");
        }
    }

    public void modifing(Integer number){
        Scanner sc = new Scanner(System.in);
        boolean det = false;
        for(WiseSaying w : ws){
            if(w.number == number){
                System.out.println("명언(기존) : " + w.text);
                System.out.print("명언 : ");
                String new_text = sc.nextLine();
                w.text = new_text;

                System.out.println("작가(기존)" + w.author);
                System.out.print("작가 : ");
                String new_author = sc.nextLine();
                w.author = new_author;

                det = true;
            }
        }
        if(!det){
            System.out.println(number + "번 명언은 존재하지 않습니다.");
        }

    }
}
