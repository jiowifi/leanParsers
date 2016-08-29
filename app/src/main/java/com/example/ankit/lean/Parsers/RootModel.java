import java.util.ArrayList;

class RootModel {

	public String topic;
	public String code_of_conduct;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String organizer_name;
	public String logo;
	public String privacy;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String state;
	public String timezone;
	public VersionModel _version;
	public String end_time;
	public String organizer_description;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String email;
	public String name;
	public String location_name;
	public String type;
	public int id;

	public RootModel(String topic, String code_of_conduct, String start_time, ArrayList<Social_linksModel> social_links, String background_image, String organizer_name, String logo, String privacy, CreatorModel creator, CopyrightModel copyright, String state, String timezone, VersionModel version, String end_time, String organizer_description, String schedule_published_on, Call_for_papersModel call_for_papers, String description, String email, String name, String location_name, String type, int id) {

		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.social_links = social_links;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.privacy = privacy;
		this._creator = creator;
		this._copyright = copyright;
		this.state = state;
		this.timezone = timezone;
		this._version = version;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.email = email;
		this.name = name;
		this.location_name = location_name;
		this.type = type;
		this.id = id;

	}

}