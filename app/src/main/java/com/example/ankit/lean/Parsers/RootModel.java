import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String location_name;
	public String timezone;
	public CopyrightModel _copyright;
	public String type;
	public String description;
	public String name;
	public String background_image;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String privacy;
	public String start_time;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String state;
	public String organizer_description;
	public String topic;
	public CreatorModel _creator;
	public String email;
	public String organizer_name;
	public int id;

	public RootModel(String schedule_published_on, String location_name, String timezone, CopyrightModel copyright, String type, String description, String name, String background_image, String logo, Call_for_papersModel call_for_papers, String end_time, String privacy, String start_time, VersionModel version, ArrayList<Social_linksModel> social_links, String code_of_conduct, String state, String organizer_description, String topic, CreatorModel creator, String email, String organizer_name, int id) {

		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.timezone = timezone;
		this._copyright = copyright;
		this.type = type;
		this.description = description;
		this.name = name;
		this.background_image = background_image;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.privacy = privacy;
		this.start_time = start_time;
		this._version = version;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this._creator = creator;
		this.email = email;
		this.organizer_name = organizer_name;
		this.id = id;

	}

}