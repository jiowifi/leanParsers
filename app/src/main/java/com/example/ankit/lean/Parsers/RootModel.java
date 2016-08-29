import java.util.ArrayList;

class RootModel {

	public String description;
	public String state;
	public CopyrightModel _copyright;
	public String email;
	public String topic;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String type;
	public String logo;
	public String background_image;
	public String privacy;
	public String name;
	public String timezone;
	public CreatorModel _creator;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String start_time;
	public String organizer_name;
	public VersionModel _version;
	public int id;
	public String code_of_conduct;

	public RootModel(String description, String state, CopyrightModel copyright, String email, String topic, String location_name, Call_for_papersModel call_for_papers, String schedule_published_on, String type, String logo, String background_image, String privacy, String name, String timezone, CreatorModel creator, String end_time, ArrayList<Social_linksModel> social_links, String organizer_description, String start_time, String organizer_name, VersionModel version, int id, String code_of_conduct) {

		this.description = description;
		this.state = state;
		this._copyright = copyright;
		this.email = email;
		this.topic = topic;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.logo = logo;
		this.background_image = background_image;
		this.privacy = privacy;
		this.name = name;
		this.timezone = timezone;
		this._creator = creator;
		this.end_time = end_time;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this._version = version;
		this.id = id;
		this.code_of_conduct = code_of_conduct;

	}

}