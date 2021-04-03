package javaStudy;

public class Study20 {

	public static void main(String[] args) {
		System.out.println("ソウルナンバー占いをします。");
		System.out.println("あなたの生年月日を数字のみ入力してください。");
		System.out.println("例）2000年1月1日　→　20000101");
		
		//入力値
		int input = new java.util.Scanner(System.in).nextInt();
		
		//入力値の受け渡し
		int total = soulNum(input);
		System.out.println("あなたのソウルナンバーは" + total + "です");
		
		//ソウルナンバーの受け渡し
		String result = result(total);
		System.out.println(result);
		
	}
	
	public static int soulNum(int a) {
		//各桁の和
		int num = 0;
		while(a != 0) {
			num += a % 10;
			a /= 10;
		}
		
		//ソウルナンバー判定
		if(num >= 10 && num != 11 && num != 22 && num != 33 && num != 44) {
			int secondNum = 0;
			while(num != 0) {
				secondNum += num % 10;
				num /= 10;
			}
			return secondNum;
		}else {
			return num;
		}
		
	}
	
	//ソウルナンバーの結果
	public static String result(int b) {
		switch(b) {
			case 1:
				System.out.println("ソウルナンバーが" + b + "の人の特徴は下記です。");
				System.out.println("「リーダー気質」");
				System.out.println("「切り替えが早い」");
				System.out.println("「八方美人」");
				System.out.println("「カリスマ」");
				System.out.println("「楽観的」");
				break;
			
			case 2:
				System.out.println("ソウルナンバーが" + b + "の人の特徴は下記です。");
				System.out.println("「頭の回転が速い」");
				System.out.println("「冷静に分析する」");
				System.out.println("「個人プレーが得意」");
				System.out.println("「平和主義」");
				System.out.println("「自己主張が苦手」");
				break;
				
			case 3:
				System.out.println("ソウルナンバーが" + b + "の人の特徴は下記です。");
				System.out.println("「平和主義」");
				System.out.println("「プラス思考」");
				System.out.println("「柔軟な対応ができる」");
				System.out.println("「タフなメンタル」");
				System.out.println("「独自の感性を持つ」");
				break;
				
			case 4:
				System.out.println("ソウルナンバーが" + b + "の人の特徴は下記です。");
				System.out.println("「チームの中心」");
				System.out.println("「クリエイティブで仕事好き」");
				System.out.println("「甘え上手」");
				System.out.println("「常に前向き」");
				System.out.println("「保守的な安定志向」");
				break;
				
			case 5:
				System.out.println("ソウルナンバーが" + b + "の人の特徴は下記です。");
				System.out.println("「とにかく真面目」");
				System.out.println("「頑固な一面あり」");
				System.out.println("「ロマンチスト」");
				System.out.println("「芸術家肌」");
				System.out.println("「チームの中心」");
				break;
				
			case 6:
				System.out.println("ソウルナンバーが" + b + "の人の特徴は下記です。");
				System.out.println("「社交的」");
				System.out.println("「好奇心旺盛」");
				System.out.println("「マイペース」");
				System.out.println("「現実主義」");
				System.out.println("「他人の目を気にする」");
				break;
				
			case 7:
				System.out.println("ソウルナンバーが" + b + "の人の特徴は下記です。");
				System.out.println("「優しさを持っている」");
				System.out.println("「周りの影響を受けやすい」");
				System.out.println("「繊細で傷つきやすい」");
				System.out.println("「気分屋でマイペース」");
				System.out.println("「探究心が強い」");
				break;
				
			case 8:
				System.out.println("ソウルナンバーが" + b + "の人の特徴は下記です。");
				System.out.println("「目標達成が生きがい」");
				System.out.println("「テンションが高い」");
				System.out.println("「頼られると能力を発揮する」");
				System.out.println("「はっきりとしている」");
				System.out.println("「決断力が高い」");
				System.out.println("「向上心が高く世渡り上手」");
				break;
				
			case 9:
				System.out.println("ソウルナンバーが" + b + "の人の特徴は下記です。");
				System.out.println("「的確にアドバイスができる」");
				System.out.println("「自分の気持ちに素直」");
				System.out.println("「発想力が豊か」");
				System.out.println("「精神的な世界に興味がある」");
				System.out.println("「感受性が強い」");
				break;
				
			case 11:
				System.out.println("ソウルナンバーが" + b + "の人の特徴は下記です。");
				System.out.println("「感受性がずば抜けている」");
				System.out.println("「優れた実現能力を持っている」");
				System.out.println("「五感に敏感」");
				System.out.println("「平和主義」");
				System.out.println("「強運」");
				break;
				
			case 22:
				System.out.println("ソウルナンバーが" + b + "の人の特徴は下記です。");
				System.out.println("「精神的に強い」");
				System.out.println("「行動力があり、積極的」");
				System.out.println("「リーダーシップの素質がある」");
				System.out.println("「素直」");
				System.out.println("「真面目で勉強家」");
				break;
				
			case 33:
				System.out.println("ソウルナンバーが" + b + "の人の特徴は下記です。");
				System.out.println("「愛が深く奉仕の心を持つ」");
				System.out.println("「カリスマ性があり個性的」");
				System.out.println("「変わり者」");
				System.out.println("「ストレスをためやすい」");
				System.out.println("「好奇心旺盛な自由人」");
				break;
				
			case 44:
				System.out.println("ソウルナンバーが" + b + "の人の特徴は下記です。");
				System.out.println("「現実的」");
				System.out.println("「努力家」");
				System.out.println("「的確な発言をする」");
				System.out.println("「負けず嫌い」");
				System.out.println("「説得力がある」");
				break;
				
		}
		return "";
	
	}

}
