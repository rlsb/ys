package diaocha;

import java.io.UnsupportedEncodingException;

public class fenlei {
   
    public fenlei(){  	
    }
    public  String helo(String list) {
		// TODO Auto-generated method stub
    	String result="";
    	switch (list) {
		case "Art":			result="具有复杂、 想象、 冲动、独立、直觉、无秩序、情绪化、理想化、不顺从、有创意、富有表情、不重实际的特征，表现为1、喜爱艺术性的职业或情境，避免传统性的职业或情境2、富有表达能力和直觉、独立、具创意、不顺从（包括表演、写作、语言） ，并重视审美的领域";
			break;
		case "Social":		
			result="具有合作、友善、慷慨、助人、仁慈、负责、圆滑、善社交、善解人意、说服他人、理想主义等特征，表现为1、喜爱社会型的职业或情境，避免实用性的职业或情境，并以社交方面的能力解决工作及其他方面的问题，但缺乏机械能力与科学能力2、喜欢帮助别人、了解别人，有教导别人的能力，且重视社会与伦理的活动与问题。";	
			break;
		case "Enterprise":	result="具有冒险、野心、独断、冲动、乐观、自信、追求享受、精力充沛、善于社交、获取注意、知名度等特征，表现为1、喜欢企业性质的的职业或环境，避免研究性质的职业或情境，会以企业方面的能力解决工作或其他方面的问题能力2、有冲动、自信、善社交、知名度高、有领导与语言能力，缺乏科学能力，但重视政治与经济上的成就。";		
			break;
		case "Intelligence":result="具有分析、谨慎、批评、好奇、独立、聪明、内向、条理、谦逊、精确、理发、保守的特征，表现为1、喜爱研究性的职业或情境，避免企业性的职业或情境2、用研究的能力解决工作及其他方面的问题，即自觉、好学、自信，重视科学，但缺乏领导方面的才能。";		
			break;
		case "Reality":		result="具有顺从、坦率、谦虚、自然、坚毅、实际、有礼、害羞、稳健、节俭的特征，表现为1、喜爱实用性的职业或情境， 以从事所喜好的活动，避免社会性的职业或情境2、用具体实际的能力解决工作及其他方面的问题，较缺乏人际关系方面的能力。3、重视具体的事物，如金钱，权力、地位等。";
			break;
		case "Convention":	result="具有顺从、谨慎、保守、自控、服从、规律、坚毅、实际稳重、有效率、但缺乏想象力等特征，表现为1、喜欢传统性质的的职业或环境，避免艺术性质的职业或情境，会以传统的能力解决工作或其他方面的问题2、喜欢顺从、规律、有文书与数字能力，并重视商业与经济上的成就。";	
			break;
		}
    	System.out.println(result);
		return result;
	}
    public  String zhiye(String list) {
  		// TODO Auto-generated method stub
      	String result="";
      	switch (list) {
  		case "Art":			result="诗人、艺术家";
  			break;
  		case "Social":		
  							result="教师、牧师、辅导人员";	
  			break;
  		case "Enterprise":	result="推销员、 政治家、企业家";		
  			break;
  		case "Intelligence":result="科研人员数学、 生物方面的专家";		
  			break;
  		case "Reality":		result="工人、农民、土木工程师";
  			break;
  		case "Convention":	result="出纳、会计、秘书";	
  			break;
  		}
      	System.out.println(result);
  		return result;
  	}

	
}
