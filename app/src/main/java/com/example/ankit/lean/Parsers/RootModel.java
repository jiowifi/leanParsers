import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String description;
	public String timezone;
	public VersionModel _version;
	public String name;
	public String location_name;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String organizer_description;
	public String topic;
	public String schedule_published_on;
	public String background_image;
	public String end_time;
	public CreatorModel _creator;
	public String logo;
	public String email;
	public String privacy;
	public String start_time;
	public int id;

	public RootModel(String organizer_name, String description, String timezone, VersionModel version, String name, String location_name, String code_of_conduct, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String state, Call_for_papersModel call_for_papers, String type, String organizer_description, String topic, String schedule_published_on, String background_image, String end_time, CreatorModel creator, String logo, String email, String privacy, String start_time, int id) {

		this.organizer_name = organizer_name;
		this.description = description;
		this.timezone = timezone;
		this._version = version;
		this.name = name;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.social_links = social_links;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.end_time = end_time;
		this._creator = creator;
		this.logo = logo;
		this.email = email;
		this.privacy = privacy;
		this.start_time = start_time;
		this.id = id;

	}

}