package com.zhiweiwang.thoughtworks.homework.model;

public enum DateType {
	mon {
		public String getWeekdayType() {
			return "weekday";
		}
	},
	tues {
		public String getWeekdayType() {
			return "weekday";
		}
	},
	wed {
		public String getWeekdayType() {
			return "weekday";
		}
	},
	thur {
		public String getWeekdayType() {
			return "weekday";
		}
	},
	fri {
		public String getWeekdayType() {
			return "weekday";
		}
	},
	sat {
		public String getWeekdayType() {
			return "weekend";
		}
	},
	sun {
		public String getWeekdayType() {
			return "weekend";
		}
	};

	public abstract String getWeekdayType();
}
