import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String name;
	public String description;
	public String organizer_name;
	public String location_name;
	public String privacy;
	public String email;
	public String type;
	public String timezone;
	public String logo;
	public String organizer_description;
	public int id;
	public CopyrightModel _copyright;
	public String background_image;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String schedule_published_on;
	public String start_time;
	public VersionModel _version;
	public String state;

	public RootModel(String end_time, String name, String description, String organizer_name, String location_name, String privacy, String email, String type, String timezone, String logo, String organizer_description, int id, CopyrightModel copyright, String background_image, CreatorModel creator, Call_for_papersModel call_for_papers, String code_of_conduct, ArrayList<Social_linksModel> social_links, String topic, String schedule_published_on, String start_time, VersionModel version, String state) {

		this.end_time = end_time;
		this.name = name;
		this.description = description;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.privacy = privacy;
		this.email = email;
		this.type = type;
		this.timezone = timezone;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.id = id;
		this._copyright = copyright;
		this.background_image = background_image;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this._version = version;
		this.state = state;

	}

}