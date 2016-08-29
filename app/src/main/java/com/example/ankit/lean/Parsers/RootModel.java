import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String organizer_name;
	public String email;
	public String description;
	public String timezone;
	public String topic;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String start_time;
	public String location_name;
	public String state;
	public String code_of_conduct;
	public String name;
	public String end_time;
	public VersionModel _version;
	public String background_image;
	public CreatorModel _creator;
	public int id;

	public RootModel(String privacy, String logo, ArrayList<Social_linksModel> social_links, String schedule_published_on, String organizer_name, String email, String description, String timezone, String topic, String type, Call_for_papersModel call_for_papers, CopyrightModel copyright, String organizer_description, String start_time, String location_name, String state, String code_of_conduct, String name, String end_time, VersionModel version, String background_image, CreatorModel creator, int id) {

		this.privacy = privacy;
		this.logo = logo;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.email = email;
		this.description = description;
		this.timezone = timezone;
		this.topic = topic;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.location_name = location_name;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.end_time = end_time;
		this._version = version;
		this.background_image = background_image;
		this._creator = creator;
		this.id = id;

	}

}