package ge.Task;

public class Main {
    public static void main(String[] args) {

        Employee giorgi = new Employee(Proffesion.SOFTWARE_ENGINEER,"girogi", "boy", 300);

        Statics.compeareAvvarage(giorgi);
        Employee nikush = new Employee(Proffesion.SOFTWARE_ENGINEER,"nikush", "boy", 3000000);
        Statics.compeareAvvarage(nikush);

        /**
         დაწერეთ მუშის (Employee) კლასი, რომელსაც ექნება შიდა კლასი სახელად Statistic.
         მუშას უნდა ჰქონდეს პროფესიის ენამი ველად. პროფესიის ენმას უნდა გააჩნდეს საშუალო
         ხელფასის ველი რომელსაც თქვენვე მოიფიქრებთ (მაგალითად, პროგრამისტი პროფესია
         საშუალო ხელფასით 600.00).
         სტატისტიკის კლასს უნდა ჰქონდეს ორი მეთოდი:
         1) მეთოდი რომელიც იტყვის აქვს თუ არა მუშას თავისივე პროფესიის საშუალოზე მეტი ხელფასი;
         2) მეთოდი რომელიც დააბრუნებს წლიურ ხელფასს მუშისას;
         ასევე მუშას ჰქონდეს კიდევ ერთი ველი ენამი სქესი (Gender).
         მთავარ მეთოდში შექმენით ერთი მაინც მუშა კლასის ობიექტი და ლამაზად დაწერეთ სტატისტიკის
         ორივე მეთოდის შედეგი ამ მუშისთვის.
          */
    }
}