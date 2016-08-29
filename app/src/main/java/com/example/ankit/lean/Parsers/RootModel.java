import java.util.ArrayList;

class RootModel {

	public String logo;
	public String end_time;
	public String topic;
	public String type;
	public int id;
	public String email;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String start_time;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String privacy;
	public String background_image;
	public String organizer_description;
	public String description;
	public String timezone;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String name;
	public VersionModel _version;

	public RootModel(String logo, String end_time, String topic, String type, int id, String email, String location_name, Call_for_papersModel call_for_papers, CreatorModel creator, String code_of_conduct, String start_time, String schedule_published_on, ArrayList<Social_linksModel> social_links, String state, String privacy, String background_image, String organizer_description, String description, String timezone, CopyrightModel copyright, String organizer_name, String name, VersionModel version) {

		this.logo = logo;
		this.end_time = end_time;
		this.topic = topic;
		this.type = type;
		this.id = id;
		this.email = email;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.state = state;
		this.privacy = privacy;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.description = description;
		this.timezone = timezone;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.name = name;
		this._version = version;

	}

}