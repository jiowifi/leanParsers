import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String type;
	public int id;
	public String description;
	public String end_time;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String topic;
	public CopyrightModel _copyright;
	public String start_time;
	public String email;
	public String timezone;
	public String privacy;
	public String organizer_description;
	public String background_image;
	public String state;
	public String organizer_name;
	public String name;
	public String schedule_published_on;
	public String code_of_conduct;

	public RootModel(VersionModel version, Call_for_papersModel call_for_papers, String location_name, String type, int id, String description, String end_time, String logo, ArrayList<Social_linksModel> social_links, CreatorModel creator, String topic, CopyrightModel copyright, String start_time, String email, String timezone, String privacy, String organizer_description, String background_image, String state, String organizer_name, String name, String schedule_published_on, String code_of_conduct) {

		this._version = version;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.type = type;
		this.id = id;
		this.description = description;
		this.end_time = end_time;
		this.logo = logo;
		this.social_links = social_links;
		this._creator = creator;
		this.topic = topic;
		this._copyright = copyright;
		this.start_time = start_time;
		this.email = email;
		this.timezone = timezone;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.state = state;
		this.organizer_name = organizer_name;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;

	}

}