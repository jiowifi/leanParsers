import java.util.ArrayList;

class RootModel {

	public String description;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String timezone;
	public String name;
	public CopyrightModel _copyright;
	public String state;
	public CreatorModel _creator;
	public String privacy;
	public String location_name;
	public String schedule_published_on;
	public int id;
	public String topic;
	public String end_time;
	public String background_image;
	public String start_time;
	public VersionModel _version;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String code_of_conduct;
	public String organizer_name;

	public RootModel(String description, String logo, Call_for_papersModel call_for_papers, String email, String timezone, String name, CopyrightModel copyright, String state, CreatorModel creator, String privacy, String location_name, String schedule_published_on, int id, String topic, String end_time, String background_image, String start_time, VersionModel version, String organizer_description, ArrayList<Social_linksModel> social_links, String type, String code_of_conduct, String organizer_name) {

		this.description = description;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.timezone = timezone;
		this.name = name;
		this._copyright = copyright;
		this.state = state;
		this._creator = creator;
		this.privacy = privacy;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.topic = topic;
		this.end_time = end_time;
		this.background_image = background_image;
		this.start_time = start_time;
		this._version = version;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;

	}

}