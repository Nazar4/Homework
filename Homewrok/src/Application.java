public class Application {
    public static void main(String[] args) {
        Robot robot = new Robot();
        CoffeeRobot coffeeRobot = new CoffeeRobot();
        RobotDancer robotDancer = new RobotDancer();
        RobotCooker robotCooker = new RobotCooker();
        robot.work("as");
        coffeeRobot.work("as");
        robotDancer.work("as");
        robotCooker.work("as");
    }
}
