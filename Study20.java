package javaStudy;

public class Study20 {

	public static void main(String[] args) {
		System.out.println("�\�E���i���o�[�肢�����܂��B");
		System.out.println("���Ȃ��̐��N�����𐔎��̂ݓ��͂��Ă��������B");
		System.out.println("��j2000�N1��1���@���@20000101");
		
		//���͒l
		int input = new java.util.Scanner(System.in).nextInt();
		
		//���͒l�̎󂯓n��
		int total = soulNum(input);
		System.out.println("���Ȃ��̃\�E���i���o�[��" + total + "�ł�");
		
		//�\�E���i���o�[�̎󂯓n��
		String result = result(total);
		System.out.println(result);
		
	}
	
	public static int soulNum(int a) {
		//�e���̘a
		int num = 0;
		while(a != 0) {
			num += a % 10;
			a /= 10;
		}
		
		//�\�E���i���o�[����
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
	
	//�\�E���i���o�[�̌���
	public static String result(int b) {
		switch(b) {
			case 1:
				System.out.println("�\�E���i���o�[��" + b + "�̐l�̓����͉��L�ł��B");
				System.out.println("�u���[�_�[�C���v");
				System.out.println("�u�؂�ւ��������v");
				System.out.println("�u�������l�v");
				System.out.println("�u�J���X�}�v");
				System.out.println("�u�y�ϓI�v");
				break;
			
			case 2:
				System.out.println("�\�E���i���o�[��" + b + "�̐l�̓����͉��L�ł��B");
				System.out.println("�u���̉�]�������v");
				System.out.println("�u��Âɕ��͂���v");
				System.out.println("�u�l�v���[�����Ӂv");
				System.out.println("�u���a��`�v");
				System.out.println("�u���Ȏ咣�����v");
				break;
				
			case 3:
				System.out.println("�\�E���i���o�[��" + b + "�̐l�̓����͉��L�ł��B");
				System.out.println("�u���a��`�v");
				System.out.println("�u�v���X�v�l�v");
				System.out.println("�u�_��ȑΉ����ł���v");
				System.out.println("�u�^�t�ȃ����^���v");
				System.out.println("�u�Ǝ��̊��������v");
				break;
				
			case 4:
				System.out.println("�\�E���i���o�[��" + b + "�̐l�̓����͉��L�ł��B");
				System.out.println("�u�`�[���̒��S�v");
				System.out.println("�u�N���G�C�e�B�u�Ŏd���D���v");
				System.out.println("�u�Â����v");
				System.out.println("�u��ɑO�����v");
				System.out.println("�u�ێ�I�Ȉ���u���v");
				break;
				
			case 5:
				System.out.println("�\�E���i���o�[��" + b + "�̐l�̓����͉��L�ł��B");
				System.out.println("�u�Ƃɂ����^�ʖځv");
				System.out.println("�u��łȈ�ʂ���v");
				System.out.println("�u���}���`�X�g�v");
				System.out.println("�u�|�p�Ɣ��v");
				System.out.println("�u�`�[���̒��S�v");
				break;
				
			case 6:
				System.out.println("�\�E���i���o�[��" + b + "�̐l�̓����͉��L�ł��B");
				System.out.println("�u�Ќ�I�v");
				System.out.println("�u�D��S�����v");
				System.out.println("�u�}�C�y�[�X�v");
				System.out.println("�u������`�v");
				System.out.println("�u���l�̖ڂ��C�ɂ���v");
				break;
				
			case 7:
				System.out.println("�\�E���i���o�[��" + b + "�̐l�̓����͉��L�ł��B");
				System.out.println("�u�D�����������Ă���v");
				System.out.println("�u����̉e�����󂯂₷���v");
				System.out.println("�u�@�ׂŏ����₷���v");
				System.out.println("�u�C�����Ń}�C�y�[�X�v");
				System.out.println("�u�T���S�������v");
				break;
				
			case 8:
				System.out.println("�\�E���i���o�[��" + b + "�̐l�̓����͉��L�ł��B");
				System.out.println("�u�ڕW�B�������������v");
				System.out.println("�u�e���V�����������v");
				System.out.println("�u������Ɣ\�͂𔭊�����v");
				System.out.println("�u�͂�����Ƃ��Ă���v");
				System.out.println("�u���f�͂������v");
				System.out.println("�u����S���������n����v");
				break;
				
			case 9:
				System.out.println("�\�E���i���o�[��" + b + "�̐l�̓����͉��L�ł��B");
				System.out.println("�u�I�m�ɃA�h�o�C�X���ł���v");
				System.out.println("�u�����̋C�����ɑf���v");
				System.out.println("�u���z�͂��L���v");
				System.out.println("�u���_�I�Ȑ��E�ɋ���������v");
				System.out.println("�u���󐫂������v");
				break;
				
			case 11:
				System.out.println("�\�E���i���o�[��" + b + "�̐l�̓����͉��L�ł��B");
				System.out.println("�u���󐫂����Δ����Ă���v");
				System.out.println("�u�D�ꂽ�����\�͂������Ă���v");
				System.out.println("�u�܊��ɕq���v");
				System.out.println("�u���a��`�v");
				System.out.println("�u���^�v");
				break;
				
			case 22:
				System.out.println("�\�E���i���o�[��" + b + "�̐l�̓����͉��L�ł��B");
				System.out.println("�u���_�I�ɋ����v");
				System.out.println("�u�s���͂�����A�ϋɓI�v");
				System.out.println("�u���[�_�[�V�b�v�̑f��������v");
				System.out.println("�u�f���v");
				System.out.println("�u�^�ʖڂŕ׋��Ɓv");
				break;
				
			case 33:
				System.out.println("�\�E���i���o�[��" + b + "�̐l�̓����͉��L�ł��B");
				System.out.println("�u�����[����d�̐S�����v");
				System.out.println("�u�J���X�}����������I�v");
				System.out.println("�u�ς��ҁv");
				System.out.println("�u�X�g���X�����߂₷���v");
				System.out.println("�u�D��S�����Ȏ��R�l�v");
				break;
				
			case 44:
				System.out.println("�\�E���i���o�[��" + b + "�̐l�̓����͉��L�ł��B");
				System.out.println("�u�����I�v");
				System.out.println("�u�w�͉Ɓv");
				System.out.println("�u�I�m�Ȕ���������v");
				System.out.println("�u�����������v");
				System.out.println("�u�����͂�����v");
				break;
				
		}
		return "";
	
	}

}
