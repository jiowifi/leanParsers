import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String organizer_description;
	public String privacy;
	public String logo;
	public VersionModel _version;
	public String organizer_name;
	public String email;
	public String start_time;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String description;
	public String background_image;
	public String name;
	public int id;
	public String schedule_published_on;
	public String code_of_conduct;
	public String type;
	public String timezone;
	public String topic;
	public String state;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(CopyrightModel copyright, CreatorModel creator, String organizer_description, String privacy, String logo, VersionModel version, String organizer_name, String email, String start_time, String location_name, Call_for_papersModel call_for_papers, String end_time, String description, String background_image, String name, int id, String schedule_published_on, String code_of_conduct, String type, String timezone, String topic, String state, ArrayList<Social_linksModel> social_links) {

		this._copyright = copyright;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.logo = logo;
		this._version = version;
		this.organizer_name = organizer_name;
		this.email = email;
		this.start_time = start_time;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.description = description;
		this.background_image = background_image;
		this.name = name;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.timezone = timezone;
		this.topic = topic;
		this.state = state;
		this.social_links = social_links;

	}

}