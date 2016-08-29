import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public VersionModel _version;
	public int id;
	public String state;
	public String background_image;
	public String timezone;
	public String name;
	public CreatorModel _creator;
	public String topic;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String start_time;
	public String email;
	public String privacy;
	public String location_name;
	public String schedule_published_on;
	public String end_time;
	public String description;

	public RootModel(String organizer_description, String organizer_name, Call_for_papersModel call_for_papers, CopyrightModel copyright, String code_of_conduct, VersionModel version, int id, String state, String background_image, String timezone, String name, CreatorModel creator, String topic, String type, ArrayList<Social_linksModel> social_links, String logo, String start_time, String email, String privacy, String location_name, String schedule_published_on, String end_time, String description) {

		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.id = id;
		this.state = state;
		this.background_image = background_image;
		this.timezone = timezone;
		this.name = name;
		this._creator = creator;
		this.topic = topic;
		this.type = type;
		this.social_links = social_links;
		this.logo = logo;
		this.start_time = start_time;
		this.email = email;
		this.privacy = privacy;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.description = description;

	}

}