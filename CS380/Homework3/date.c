#include "types.h"
#include "user.h"
#include "date.h"

int main (int argc, char *argv[]) {
	struct rtcdate r;
	if (date(&r)) {
		printf(2, "date failed\n");
		exit();
	}
	
	printf(1, "Date: %d:%d:%d - %d/%d/%d", r.hour, r.minute, r.second,
		r.month, r.day, r.year); 
	
	exit();
}
