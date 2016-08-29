import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String email;
	public String type;
	public String logo;
	public VersionModel _version;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String organizer_description;
	public String state;
	public String description;
	public String name;
	public String topic;
	public String privacy;
	public String schedule_published_on;
	public CreatorModel _creator;
	public int id;
	public String timezone;

	public RootModel(String start_time, String code_of_conduct, CopyrightModel copyright, String email, String type, String logo, VersionModel version, String location_name, ArrayList<Social_linksModel> social_links, String background_image, String organizer_name, Call_for_papersModel call_for_papers, String end_time, String organizer_description, String state, String description, String name, String topic, String privacy, String schedule_published_on, CreatorModel creator, int id, String timezone) {

		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.email = email;
		this.type = type;
		this.logo = logo;
		this._version = version;
		this.location_name = location_name;
		this.social_links = social_links;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.state = state;
		this.description = description;
		this.name = name;
		this.topic = topic;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.id = id;
		this.timezone = timezone;

	}

}