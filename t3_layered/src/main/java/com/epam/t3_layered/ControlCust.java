package com.epam.t3_layered;

/**presentation layer**/
@Controller
@RequiredArgsConstructor
public class ControlCust {
 
 private final CustService custService;

 @PostMapping(value = "/customers/add-money")
 public @ResponseBody CustAddMoneyDTO addMoney(@RequestBody CustomerAddMoneyDTO dto) {
   return custService.addFundsToCustomer(dto);
 }
 
}