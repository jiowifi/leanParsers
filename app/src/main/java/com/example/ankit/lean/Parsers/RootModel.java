import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String email;
	public String background_image;
	public String description;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String logo;
	public CreatorModel _creator;
	public String state;
	public String start_time;
	public String schedule_published_on;
	public int id;
	public String location_name;
	public String privacy;
	public String timezone;
	public String organizer_name;
	public String type;
	public String end_time;
	public String name;
	public String code_of_conduct;

	public RootModel(CopyrightModel copyright, String email, String background_image, String description, VersionModel version, Call_for_papersModel call_for_papers, String topic, ArrayList<Social_linksModel> social_links, String organizer_description, String logo, CreatorModel creator, String state, String start_time, String schedule_published_on, int id, String location_name, String privacy, String timezone, String organizer_name, String type, String end_time, String name, String code_of_conduct) {

		this._copyright = copyright;
		this.email = email;
		this.background_image = background_image;
		this.description = description;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this._creator = creator;
		this.state = state;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.location_name = location_name;
		this.privacy = privacy;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.type = type;
		this.end_time = end_time;
		this.name = name;
		this.code_of_conduct = code_of_conduct;

	}

}