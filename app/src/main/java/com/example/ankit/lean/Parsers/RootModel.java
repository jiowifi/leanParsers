import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String email;
	public String organizer_description;
	public String location_name;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String end_time;
	public String timezone;
	public String state;
	public String name;
	public String privacy;
	public String topic;
	public String logo;
	public String code_of_conduct;
	public String organizer_name;
	public String description;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String type;
	public CreatorModel _creator;
	public int id;

	public RootModel(String schedule_published_on, String email, String organizer_description, String location_name, String background_image, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String end_time, String timezone, String state, String name, String privacy, String topic, String logo, String code_of_conduct, String organizer_name, String description, String start_time, Call_for_papersModel call_for_papers, VersionModel version, String type, CreatorModel creator, int id) {

		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.background_image = background_image;
		this.social_links = social_links;
		this._copyright = copyright;
		this.end_time = end_time;
		this.timezone = timezone;
		this.state = state;
		this.name = name;
		this.privacy = privacy;
		this.topic = topic;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.description = description;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.type = type;
		this._creator = creator;
		this.id = id;

	}

}