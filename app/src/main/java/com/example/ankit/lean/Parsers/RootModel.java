import java.util.ArrayList;

class RootModel {

	public String email;
	public String end_time;
	public CopyrightModel _copyright;
	public String timezone;
	public String name;
	public String organizer_name;
	public String background_image;
	public CreatorModel _creator;
	public String type;
	public String state;
	public String topic;
	public String start_time;
	public VersionModel _version;
	public String code_of_conduct;
	public String logo;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String privacy;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public int id;

	public RootModel(String email, String end_time, CopyrightModel copyright, String timezone, String name, String organizer_name, String background_image, CreatorModel creator, String type, String state, String topic, String start_time, VersionModel version, String code_of_conduct, String logo, String description, Call_for_papersModel call_for_papers, String location_name, String privacy, String organizer_description, ArrayList<Social_linksModel> social_links, String schedule_published_on, int id) {

		this.email = email;
		this.end_time = end_time;
		this._copyright = copyright;
		this.timezone = timezone;
		this.name = name;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this._creator = creator;
		this.type = type;
		this.state = state;
		this.topic = topic;
		this.start_time = start_time;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.id = id;

	}

}