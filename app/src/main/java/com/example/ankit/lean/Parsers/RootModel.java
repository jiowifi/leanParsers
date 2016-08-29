import java.util.ArrayList;

class RootModel {

	public String email;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public CreatorModel _creator;
	public String logo;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String organizer_description;
	public String state;
	public String privacy;
	public String start_time;
	public String end_time;
	public String name;
	public String location_name;
	public String topic;
	public String background_image;
	public int id;
	public String schedule_published_on;
	public String code_of_conduct;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;

	public RootModel(String email, String description, ArrayList<Social_linksModel> social_links, String type, CreatorModel creator, String logo, CopyrightModel copyright, String organizer_name, String organizer_description, String state, String privacy, String start_time, String end_time, String name, String location_name, String topic, String background_image, int id, String schedule_published_on, String code_of_conduct, String timezone, Call_for_papersModel call_for_papers, VersionModel version) {

		this.email = email;
		this.description = description;
		this.social_links = social_links;
		this.type = type;
		this._creator = creator;
		this.logo = logo;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.state = state;
		this.privacy = privacy;
		this.start_time = start_time;
		this.end_time = end_time;
		this.name = name;
		this.location_name = location_name;
		this.topic = topic;
		this.background_image = background_image;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this._version = version;

	}

}