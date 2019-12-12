package cs5800m3;

	public class Manage implements ComeToWork{
		   @Override
		   public void work() {
		      System.out.println("Managing other employees.");
		   }

		@Override
		public void takePause() {
			System.out.println("Taking a small break from managing employees.");
			
		}

		@Override
		public void getPaid() {
			System.out.println("Getting paid for overseeing the developement of the project.");
			
		}
		}

		   

