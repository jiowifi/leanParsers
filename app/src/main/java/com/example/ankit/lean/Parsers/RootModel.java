import java.util.ArrayList;

class RootModel {

	public String email;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String type;
	public String organizer_description;
	public String start_time;
	public String description;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String code_of_conduct;
	public String logo;
	public String timezone;
	public String location_name;
	public String topic;
	public String background_image;
	public String organizer_name;
	public String state;
	public String privacy;
	public String name;
	public String end_time;

	public RootModel(String email, Call_for_papersModel call_for_papers, CreatorModel creator, String schedule_published_on, String type, String organizer_description, String start_time, String description, CopyrightModel copyright, VersionModel version, ArrayList<Social_linksModel> social_links, int id, String code_of_conduct, String logo, String timezone, String location_name, String topic, String background_image, String organizer_name, String state, String privacy, String name, String end_time) {

		this.email = email;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.description = description;
		this._copyright = copyright;
		this._version = version;
		this.social_links = social_links;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.timezone = timezone;
		this.location_name = location_name;
		this.topic = topic;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.state = state;
		this.privacy = privacy;
		this.name = name;
		this.end_time = end_time;

	}

}