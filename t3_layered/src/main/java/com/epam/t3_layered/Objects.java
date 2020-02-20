package com.epam.t3_layered;


/**: Data Transfer Objects, Domain Objects, Entity Objects.**/
public class Objects {
	class CustAddMoneyDTO {
		 
		 public String username;
		 public Integer moneyAmount;
		 
		}

		class Cust {
		 
		 public String username;
		 public String password;
		 public String moneyAmount;
		 
		}

		@Entity
		@Table(name="CUSTOMER")
		class CustomerEntity {
		 
		 @Id
		 @GeneratedValue(strategy=GenerationType.AUTO)
		 public Long id;
		  
		 @Column(name="USERNAME")
		 public String username;
		 
		 @Column(name="PASSWORD")
		 public String password;
		 
		 @Column(name="MONEY_AMOUNT")
		 public Integer moneyAmount;
		 
		}

}