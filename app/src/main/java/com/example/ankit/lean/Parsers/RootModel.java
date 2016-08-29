import java.util.ArrayList;

class RootModel {

	public String description;
	public String location_name;
	public String timezone;
	public String name;
	public VersionModel _version;
	public String schedule_published_on;
	public String organizer_description;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String type;
	public CreatorModel _creator;
	public String organizer_name;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String start_time;
	public String end_time;
	public String email;
	public String background_image;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public int id;

	public RootModel(String description, String location_name, String timezone, String name, VersionModel version, String schedule_published_on, String organizer_description, String privacy, ArrayList<Social_linksModel> social_links, String topic, String type, CreatorModel creator, String organizer_name, String state, Call_for_papersModel call_for_papers, String logo, String start_time, String end_time, String email, String background_image, String code_of_conduct, CopyrightModel copyright, int id) {

		this.description = description;
		this.location_name = location_name;
		this.timezone = timezone;
		this.name = name;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.social_links = social_links;
		this.topic = topic;
		this.type = type;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.start_time = start_time;
		this.end_time = end_time;
		this.email = email;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.id = id;

	}

}