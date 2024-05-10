//package com;
//import com.chihyun.coupon.entity.Coupon;
//import com.iting.productorder.dao.ProductOrderRepository;
//import com.iting.productorder.entity.ProductOrder;
//import com.roger.member.entity.Member;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import java.math.BigDecimal;
//import java.sql.Timestamp;
//import java.util.Optional;
//
//
//@SpringBootApplication
//public class Test_Application implements CommandLineRunner {
//
//    @Autowired
//    ProductOrderRepository repository ;
//
//
//
//    public static void main(String[] args) {
//        SpringApplication.run(Test_Application.class);
//    }
//
//    @Override
//    public void run(String...args) throws Exception {
//
//        //● 新增
////        Member member = new Member(); // 部門POJO
////        member.setMemNo(1);
////        Coupon coupon = new Coupon();
////        coupon.setCoupNo(2);
////        ProductOrder productOrder1 = new ProductOrder();
////        productOrder1.setMember(member);
////        productOrder1.setproductByrName("John Doe");
////        productOrder1.setproductByrPhone(Integer.valueOf("0912345678"));
////        productOrder1.setproductByrEmail("john.doe@example.com");
////        productOrder1.setproductRcvName("Jane Doe");
////        productOrder1.setproductRcvPhone("0912345678");
////        productOrder1.setproductTakeMethod((byte) 2);
////        productOrder1.setproductAddr("台北市大安區忠孝東路四段100號");
////        productOrder1.setproductPayMethod((byte) 1);
////        productOrder1.setproductAllPrice(new BigDecimal("7060"));
////        productOrder1.setCoupon(coupon);
////        productOrder1.setproductDisc(new BigDecimal("706"));
////        productOrder1.setproductRealPrice(new BigDecimal("6354"));
////        productOrder1.setproductOrdTime(new Timestamp(System.currentTimeMillis())); // 设置为当前时间戳
////        productOrder1.setproductOrdStat((byte) 10);
////        productOrder1.setproductStat((byte) 1);
////
////        repository.save(productOrder1);
//
//        //● 修改
////		EmpVO empVO2 = new EmpVO();
////		empVO2.setEmpno(7001);
////		empVO2.setEname("吳永志2");
////		empVO2.setJob("MANAGER2");
////		empVO2.setHiredate(java.sql.Date.valueOf("2002-01-01"));
////		empVO2.setSal(new Double(20000));
////		empVO2.setComm(new Double(200));
////		empVO2.setDeptVO(deptVO);
////		repository.save(empVO2);
//
//        //● 刪除   //●●● --> EmployeeRepository.java 內自訂的刪除方法
////		repository.deleteByEmpno(7014);
//
//        //● 刪除   //XXX --> Repository內建的刪除方法目前無法使用，因為有@ManyToOne
//        //System.out.println("--------------------------------");
//        //repository.deleteById(7001);
//        //System.out.println("--------------------------------");
//
//        //● 查詢-findByPrimaryKey (多方emp2.hbm.xml必須設為lazy="false")(優!)
//        Optional<ProductOrder> optional = repository.findById(3);
//        optional.ifPresent(empVO3 -> {
//            Optional.ofNullable(empVO3.getMember())
//                    .ifPresent(member -> System.out.print(member.getMemNo() + ","));
//            System.out.print(empVO3.getproductByrPhone() + ",");
//
//            System.out.print(empVO3.getproductOrdNo() + ",");
//            System.out.print(empVO3.getproductByrName() + ",");
//            System.out.print(empVO3.getproductByrEmail() + ",");
//            System.out.print(empVO3.getproductRcvName() + ",");
//            System.out.print(empVO3.getproductTakeMethod() + ",");
//            // 注意以下三行的寫法 (優!)
//            System.out.print(empVO3.getproductPayMethod() + ",");
//            System.out.print(empVO3.getproductAllPrice() + ",");
//            System.out.print(empVO3.getproductDisc() + ",");
//            System.out.print(empVO3.getproductOrdTime() + ",");
//            System.out.print(empVO3.getproductOrdStat() + ",");
//            System.out.print(empVO3.getproductStat() + ",");
//
//            Optional.ofNullable(empVO3.getCoupon())
//                    .ifPresent(coupon -> System.out.print(coupon.getCoupNo() + ","));
//
//
//            System.out.print(empVO3.getMember().getMemNo() + ",");
//        });
////		System.out.println("\n---------------------");
//
//
//
//
//
//        //● 複合查詢-getAll(map) 配合 req.getParameterMap()方法 回傳 java.util.Map<java.lang.String,java.lang.String[]> 之測試
////		Map<String, String[]> map = new TreeMap<String, String[]>();
////		map.put("empno", new String[] { "7001" });
////		map.put("ename", new String[] { "KING" });
////		map.put("job", new String[] { "PRESIDENT" });
////		map.put("hiredate", new String[] { "1981-11-17" });
////		map.put("sal", new String[] { "5000.5" });
////		map.put("comm", new String[] { "0.0" });
////		map.put("deptno", new String[] { "1" });
////
////		List<EmpVO> list2 = HibernateUtil_CompositeQuery_Emp3.getAllC(map,sessionFactory.openSession());
////		for (EmpVO aEmp : list2) {
////			System.out.print(aEmp.getEmpno() + ",");
////			System.out.print(aEmp.getEname() + ",");
////			System.out.print(aEmp.getJob() + ",");
////			System.out.print(aEmp.getHiredate() + ",");
////			System.out.print(aEmp.getSal() + ",");
////			System.out.print(aEmp.getComm() + ",");
////			// 注意以下三行的寫法 (優!)
////			System.out.print(aEmp.getDeptVO().getDeptno() + ",");
////			System.out.print(aEmp.getDeptVO().getDname() + ",");
////			System.out.print(aEmp.getDeptVO().getLoc());
////			System.out.println();
////		}
//
//    }
//}
//
