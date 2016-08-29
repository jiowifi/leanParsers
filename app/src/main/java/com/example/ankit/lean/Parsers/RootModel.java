import java.util.ArrayList;

class RootModel {

	public String topic;
	public String type;
	public String privacy;
	public String email;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String start_time;
	public String timezone;
	public String location_name;
	public String code_of_conduct;
	public String organizer_name;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String end_time;
	public String logo;
	public String state;
	public String description;
	public String schedule_published_on;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public int id;

	public RootModel(String topic, String type, String privacy, String email, String background_image, Call_for_papersModel call_for_papers, VersionModel version, String start_time, String timezone, String location_name, String code_of_conduct, String organizer_name, String organizer_description, CopyrightModel copyright, String end_time, String logo, String state, String description, String schedule_published_on, String name, ArrayList<Social_linksModel> social_links, CreatorModel creator, int id) {

		this.topic = topic;
		this.type = type;
		this.privacy = privacy;
		this.email = email;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.start_time = start_time;
		this.timezone = timezone;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.end_time = end_time;
		this.logo = logo;
		this.state = state;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.social_links = social_links;
		this._creator = creator;
		this.id = id;

	}

}