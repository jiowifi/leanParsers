import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String email;
	public String timezone;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String organizer_description;
	public String topic;
	public String background_image;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String logo;
	public String start_time;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String location_name;
	public CreatorModel _creator;
	public String description;
	public String privacy;
	public String end_time;
	public String name;
	public int id;

	public RootModel(String schedule_published_on, String email, String timezone, VersionModel version, Call_for_papersModel call_for_papers, String state, String organizer_description, String topic, String background_image, String organizer_name, ArrayList<Social_linksModel> social_links, String type, String logo, String start_time, CopyrightModel copyright, String code_of_conduct, String location_name, CreatorModel creator, String description, String privacy, String end_time, String name, int id) {

		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.timezone = timezone;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.type = type;
		this.logo = logo;
		this.start_time = start_time;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this._creator = creator;
		this.description = description;
		this.privacy = privacy;
		this.end_time = end_time;
		this.name = name;
		this.id = id;

	}

}