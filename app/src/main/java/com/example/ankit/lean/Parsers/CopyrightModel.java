
class CopyrightModel {

	public int year;
	public String holder_url;
	public String holder;
	public String licence;
	public String licence_url;
	public String logo;

	public CopyrightModel(int year, String holder_url, String holder, String licence, String licence_url, String logo) {

		this.year = year;
		this.holder_url = holder_url;
		this.holder = holder;
		this.licence = licence;
		this.licence_url = licence_url;
		this.logo = logo;

	}

}