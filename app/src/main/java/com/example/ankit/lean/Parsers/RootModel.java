import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String state;
	public VersionModel _version;
	public String organizer_name;
	public String start_time;
	public String end_time;
	public String type;
	public String topic;
	public String background_image;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String description;
	public String name;
	public String email;
	public String privacy;
	public int id;

	public RootModel(String location_name, String organizer_description, CopyrightModel copyright, String state, VersionModel version, String organizer_name, String start_time, String end_time, String type, String topic, String background_image, String schedule_published_on, ArrayList<Social_linksModel> social_links, String logo, Call_for_papersModel call_for_papers, String timezone, String code_of_conduct, CreatorModel creator, String description, String name, String email, String privacy, int id) {

		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.state = state;
		this._version = version;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.end_time = end_time;
		this.type = type;
		this.topic = topic;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.description = description;
		this.name = name;
		this.email = email;
		this.privacy = privacy;
		this.id = id;

	}

}