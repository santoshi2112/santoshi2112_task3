package com.epam.t3_layered;

/**Application Layer**/

	@Repository
	public interface CustRepo extends JpaRepository<CustEntity, Long> {
	   
	   CustEntity findByUsername(String username);
	   
	}