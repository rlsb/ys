package diaocha;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class main extends HttpServlet {
	public main() {
		super();
	}
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] box3 = request.getParameterValues("box");
		String[] box1=(String[]) request.getSession().getAttribute("box1");
		String[] box2=(String[]) request.getSession().getAttribute("box2");
		int b1,b2,b3;
        if (box3==null) {
        	b3=0;
		}else{
			b3=box3.length;
		}
		if (box1==null) {
        	b1=0;
		}else{
			b1=box1.length;
		} if (box2==null) {
        	b2=0;
		}else{
			b2=box2.length;
		}
			String[] box=new String[(b1+b2+b3)];
			System.out.println(box.length);
		for (int i = 0; i < box.length; i++) {
			if (i<b1) {
				box[i]=box1[i];
			}
			else if(i<b1+b2){
				box[i]=box2[i-b1];
			}else{
				box[i]=box3[i-b1-b2];
			}
			
		}
		request.setCharacterEncoding("utf-8");
		String[] Art=Art(box);
		String[] Social=Social(box);
		String[] Enterprise=Enterprise(box);
		String[] Intelligence=Intelligence(box);
		String[] Reality=Reality(box);
		String[] Convention=Convention(box);
		
		ArrayList<String[]> num =new ArrayList<String[]>();
		ArrayList<String> numsort =new ArrayList<String>();
		num.add(Art);num.add(Social);num.add(Enterprise);
		num.add(Intelligence);num.add(Reality);num.add(Convention);
		
		int a[]={Integer.parseInt(Art[1]),Integer.parseInt(Social[1]),Integer.parseInt(Enterprise[1]),Integer.parseInt(Intelligence[1]),
				Integer.parseInt(Reality[1]),Integer.parseInt(Convention[1])};
		ArrayList<Integer> sort=selectSortK(a,3);
		for (int i = 0; i < sort.size(); i++) {
			numsort.add(num.get(sort.get(i))[0]);
			System.out.println(num.get(sort.get(i))[0]);
		}
		request.setAttribute("sort",numsort);
		RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
		rd.forward(request,response);
		}
		
	
	 public  ArrayList<Integer> selectSortK(int[] arr, int k) {
		  if(arr == null || arr.length == 0) {
		   return null;
		  }
		  int[] newArr = new int[k];
		  ArrayList<Integer> list = new ArrayList<Integer>();//记录每次最大数的下标
		  for (int i=0; i<k; i++) {
		   int maxValue = Integer.MIN_VALUE; //最大值
		   int maxIndex = i; 
		   for (int j=0; j<arr.length; j++) {
		    if (arr[j] > maxValue && !list.contains(j) ) {
		     maxValue = arr[j];
		     maxIndex = j;
		    }
		   }
		   if (!list.contains(maxIndex)) {//如果不存在，就加入
		    list.add(maxIndex);
		    newArr[i] = maxValue;
		   }
		  }
		  //最大的3个值需要排序
		  //System.out.println(list.get(i));
		  return list;
		 }
	
	//艺术型
	private String[] Art(String[] box) {
		// TODO Auto-generated method stub
		int count = 0;int f=1;
		for (int i = 0; i < box.length-1; i++) {
			if (box[i].equals("4") || box[i].equals("9") || box[i].equals("10")||
					box[i].equals("17")|| box[i].equals("33") || box[i].equals("34")||
					box[i].equals("49")|| box[i].equals("50") || box[i].equals("54")) {
				count++;
			}
			if (box[i].equals("32")) {
				f--;
			}
		}
		System.out.println("Art= "+(count+f));
		return new String[]{"Art",""+(count+f)};
	}
	//社会型
	private String[] Social(String[] box) {
		// TODO Auto-generated method stub
		int count = 0;int f=6;
		for (int i = 0; i < box.length-1; i++) {
			if (box[i].equals("26") || box[i].equals("37") || box[i].equals("52")||
					box[i].equals("59")) {
				count++;
			}
			if (box[i].equals("1")|| box[i].equals("12") || box[i].equals("15")
					|| box[i].equals("27")|| box[i].equals("45")
					|| box[i].equals("53")) {
				f--;
			}
		}
		System.out.println("Social= "+(count+f));
		return new String[]{"Social",""+(count+f)};
	}
	//管理型
	private String[] Enterprise(String[] box) {
		// TODO Auto-generated method stub
		int count = 0;int f=3;
		for (int i = 0; i < box.length-1; i++) {
			if (box[i].equals("11") || box[i].equals("24") || box[i].equals("28")||
					box[i].equals("35")|| box[i].equals("38")|| box[i].equals("46")
					|| box[i].equals("60")) {
				count++;
			}
			if (box[i].equals("3")|| box[i].equals("16") || box[i].equals("25")) {
				f--;
			}
		}
		System.out.println("Enterprise= "+(count+f));
		return new String[]{"Enterprise",""+(count+f)};
	}
	//研究型
	private String[] Intelligence(String[] box) {
		// TODO Auto-generated method stub
		int count = 0;int f=4;
		for (int i = 0; i < box.length-1; i++) {
			if (box[i].equals("6") || box[i].equals("8") || box[i].equals("20")||
					box[i].equals("30")|| box[i].equals("31")|| box[i].equals("42")) {
				count++;
			}
			if (box[i].equals("21")|| box[i].equals("55") || box[i].equals("56") ||
					box[i].equals("58")	) {
				f--;
			}
		}
		System.out.println("Intelligence= "+(count+f));
		return new String[]{"Intelligence",""+(count+f)};
	}
	//现实型
	private String[] Reality(String[] box) {
		// TODO Auto-generated method stub
		int count = 0;int f=5;
		for (int i = 0; i < box.length-1; i++) {
			if (box[i].equals("2") || box[i].equals("13") || box[i].equals("22")||
					box[i].equals("36")|| box[i].equals("43") ) {
				count++;
			}
			if (box[i].equals("14")|| box[i].equals("23") || box[i].equals("44") ||
					box[i].equals("47")|| box[i].equals("48") 	) {
				f--;
			}
		}
		System.out.println("Reality= "+(count+f));
		return new String[]{"Reality",""+(count+f)};
	}
	//常规型
	private String[] Convention(String[] box) {
		// TODO Auto-generated method stub
		int count = 0;
		int f=3;
		for (int i = 0; i < box.length-1; i++) {
			if (box[i].equals("7")|| box[i].equals("19") || box[i].equals("29") ||
				box[i].equals("39")|| box[i].equals("41") || box[i].equals("51")||
				box[i].equals("51")
					) {
				count++;
			}
			if (box[i].equals("5")|| box[i].equals("18") || box[i].equals("40") ) {
					f--;
				}
		}
		System.out.println("Convention= "+(count+f));
		return new String[]{"Convention",""+(count+f)};
	}
	
	public void init() throws ServletException {
		// Put your code here
	}

}
