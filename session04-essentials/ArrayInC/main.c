#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
	
	float vol1, vol2 = 80, vol3, vol4, vol6, vol7, vol8;
	printf("Le");
	
	//khai báo lẻ từng biến 1 khác tên nhau, cấm trùng tên
	//khai báo nhiều biến là thua 
	float vol[365]; //có 365 biến rồi đó, chưa thèm nói value
	//MẢNG - ARRAY, khai báo sỉ, các biến cùng kiểu cùng lúc, sát nhau
	//in mảng
	//side effect
	vol[0] = 50;
	vol[1] = 30;
	vol[2] = 300;
	printf("The vol array has: \n");
	
	for(int i = 0; i < 365; i++) {
		printf("%.lf", vol[i]);
	}
 	
//	float v[] = {0, 0, 5, 4343, 546, 25};
	//			

	float v[365] = {0, 0, 5, 10, 15, 20, 25};
	
	printf("The v array has: \n");
	for (int i = 0; i < 500; i++)
		printf("\n\n\n%.lf", v[i]);
	return 0;
}