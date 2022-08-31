

//Complete the classes below
class Flower{
        
        public String whatsYourName(){
            return "I have many names and types.";
        }
    }
    class Jasmine extends Flower{
        public String whatsYourName(){
            return "Jasmine";
        }
    }
    class Lily extends Flower{
        public String whatsYourName(){
            return "Lily";
        }
    }
    class Lotus extends Flower{
        public String whatsYourName(){
            return "Lotus";
        }
    }
    class Region{
        Flower yourNationalFlower(){
            return new Flower();
        }
    }
    class WestBengal extends Region{
        Jasmine yourNationalFlower(){
            return new Jasmine();
        }
    }
    class Karnataka extends Region{
        Lotus yourNationalFlower(){
            return new Lotus();
        }
    }
    class AndhraPradesh extends Region{
        Lily yourNationalFlower(){
            return new Lily();
        }
       
    }
