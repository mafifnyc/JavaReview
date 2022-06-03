public class Computer {
    public void turnOnComputer() {
        System.out.println("Computer Turned On");
    }
    public void turnOffComputer() {
        System.out.println("Computer Turned Off");
    }
    public void cleanCache() {
        System.out.println("Cache Cleaned");
    }
    public void reduceBrightness(int brightnessLevel) {
        System.out.println("Reduce Brightness by " + brightnessLevel + "%");
    }
    public void playMusic() {
        System.out.println("Started playing music");
    }
    public void adjustTheVolume(int volumeLevel) {
        System.out.println("Volume level adjusted by " + volumeLevel + "%");
    }

    public static void main(String[] args) {
        Computer myComputer = new Computer();
        myComputer.turnOnComputer();
        myComputer.turnOffComputer();
        myComputer.cleanCache();
        myComputer.reduceBrightness(15);
        myComputer.playMusic();
        myComputer.adjustTheVolume(20);
        myComputer.turnOnAndOff(70);

        ChromeBrowser newWindow = new ChromeBrowser();
        newWindow.openNewTabInChromeBrowser();
        newWindow.closeChromeBrowser();

        TextEditor myText = new TextEditor();
        System.out.println(myText.openTextEditor());
        myText.writeIntoTextEditor("sdfnolen");
        myText.closeTextEditor();

        MicrosoftOutlook myMail = new MicrosoftOutlook();
        System.out.println(myMail.openMicrosoftOutlook());
        MicrosoftOutlook.closeOutlook();

        Calculator myCalculator = new Calculator();
        myCalculator.openCalculator();
        System.out.println(myCalculator.sumOfTwoNumbers(5,10));
        System.out.println(myCalculator.addThreeNumbers(5,10,15));
        System.out.println(myCalculator.deductionOfTwoNumbers(5,10));

    }
    public void turnOnAndOff(int idleTime) {
        if(idleTime>60) {
            System.out.println("System Idle, Turning Off");
        }
        else {
            System.out.println("System Running.");
        }
    }
}
