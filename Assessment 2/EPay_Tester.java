package Test2;

public class EPay_Tester
{
	public static void main(String[] args) {
		User user=new User(101,"Jack","jack@dxc.com",1000);
		KYCUser kycUser=new KYCUser(201,"jill","jill@dxc.com",3000);
		processPayment(user,700);
		processPayment(kycUser,1500);
		processPayment(kycUser,800);
		processPayment(kycUser,1200);
		

	}
	public static void processPayment(User user,double billAmount)
	{
		if(user.makePayment(billAmount))
		{
			System.out.println("Congratulations "+user.getUsername()+",payment of "+billAmount+" was successful");
		}
		else
		{
			System.out.println("Sorry "+user.getUsername()+",not enough balance to make payment");
		}
		System.out.println("Your wallet balance is "+user.getWalletBalance());
		if(user instanceof KYCUser)
		{
			KYCUser premiumUser=(KYCUser)user;
			System.out.println("you have "+premiumUser.getRewardPoints()+" reward points!");
			
		}
		System.out.println();
		
	}
}
