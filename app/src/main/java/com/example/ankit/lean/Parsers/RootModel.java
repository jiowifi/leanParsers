import java.util.ArrayList;

class RootModel {

	public String type;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String name;
	public String topic;
	public String description;
	public String end_time;
	public String privacy;
	public String background_image;
	public String email;
	public String state;
	public String logo;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String organizer_name;
	public VersionModel _version;
	public String schedule_published_on;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public int id;

	public RootModel(String type, CopyrightModel copyright, String code_of_conduct, CreatorModel creator, String name, String topic, String description, String end_time, String privacy, String background_image, String email, String state, String logo, String location_name, Call_for_papersModel call_for_papers, String timezone, String organizer_name, VersionModel version, String schedule_published_on, String organizer_description, ArrayList<Social_linksModel> social_links, String start_time, int id) {

		this.type = type;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.name = name;
		this.topic = topic;
		this.description = description;
		this.end_time = end_time;
		this.privacy = privacy;
		this.background_image = background_image;
		this.email = email;
		this.state = state;
		this.logo = logo;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.start_time = start_time;
		this.id = id;

	}

}