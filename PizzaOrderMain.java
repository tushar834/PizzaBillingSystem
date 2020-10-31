import java.util.Scanner;

import controller.AdminController;

public class PizzaOrderMain {

	public PizzaOrderMain() {}
		
		static Scanner sc=new Scanner(System.in);
		static String userId="Rohan",userPwd="rohan97",adminId="Tushar",adminPwd="tushar95";
		
		
		public static boolean checkAdmin()
		{
			System.out.println("Enter Admin Id : ");
			String adminId=sc.next();
			System.out.println("Enter Password : ");
			String adminPwd=sc.next();
			if(PizzaOrderMain.adminId.equals(adminId) && PizzaOrderMain.adminPwd.equals(adminPwd))
			{
				return true;
			}
				return false;
		}
		public static boolean checkUser()
		{
			System.out.println("Enter User Id : ");
			String userId=sc.next();
			System.out.println("Enter Password : ");
			String userPwd=sc.next();
			if(PizzaOrderMain.userId.equals(userId) && PizzaOrderMain.userPwd.equals(userPwd))
			{
				return true;
			}
			return false;
		}
		public static int showAdminMenu()
		{
			System.out.println("\n****************ADMIN MENU*******************\n");
			System.out.println("Press 1 : Insert Pizza");
			System.out.println("Press 2 : Update Pizza");
			System.out.println("Press 3 : Delete Pizza");
			System.out.println("Press 4 : Show All Pizzas");
			System.out.println("Press 5 : Log Out");
			System.out.println("\n*********************************************\n");
			return sc.nextInt();
		}
		public static void showUserMenu()
		{
			
		}
		public static void main(String args[])
		{
			while(true)
			{
				System.out.println("Choose User \n");
				System.out.println("Press 1 if you are Administrator");
				System.out.println("Press 2 if you are Customer");
				System.out.println("----------------------------------");
				System.out.println("Enter Your Choice");
				int userInput=sc.nextInt();
				switch(userInput)
				{
				case 1:	System.out.println("-----You choose Administrator-----");
					if(checkAdmin())
					{
						System.out.println("*******WELCOME ADMIN "+adminId.toUpperCase()+" ********");
						AdminController a=new AdminController();
						while(true)
						{
							int choice=showAdminMenu();
							switch(choice)
							{
								case 1: a.insertPizza();
										break;
								case 2: a.updatePizza();
										break;
								case 3: a.deletePizza();
										break;
								case 4: a.showAllPizza();
										break;
								case 5: System.out.println("Log out");
										break;
								default: System.out.println("Can't you see the options ???");
							}
							if(choice==5)
								break;
						}
					}
						else
						{
							System.out.println("Sorry !!!!!!!!!!");
						}
						break;
				case 2:	System.out.println("-----You choose Customer-----");
					if(checkUser())
					{
						System.out.println("*******WELCOME USER "+userId.toUpperCase()+" ********");
						showUserMenu();
					}
					else
					{
						System.out.println("Sorry !!!!!!!!!!");
					}
					break;
				default:
					System.out.println("Can't you see the options ???");
				}
			}
		}

	}




