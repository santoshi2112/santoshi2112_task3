package com.epam.t3_layered;

/**we can add our Data Layer that will be our connection to the database**/
/**Data Layer**/

	@Component
	class CustomerMapper {
	 
	 public CustAddMoneyDto mapToDto(CustEntity customerEntity) {
	   CustAddMoneyDto dto = new CustAddMoneyDto();
	   dto.username = customerEntity.getUsername();
	   dto.moneyAmount = customerEntity.getMoneyAmount();
	   return dto;
	 }
	 
	}

	@Service
	@AllArgsConstructor
	class CustomerService {
	 
	 private final CustRepository custRepository;
	 private final CustomerMapper customerMapper;
	 
	 public CustAddMoneyDto addFundsToCustomer(
	   CustAddMoneyDto dto) {
	 
	   CustEntity customerEntity = custRepository.findByUsername(dto.getUsername());
	   custEntity.moneyAmount += dto.getMoneyAmount();
	   return customerMapper.mapToDto(custRepository.save(customerEntity));
	 }