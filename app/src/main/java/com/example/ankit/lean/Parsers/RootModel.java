import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String organizer_description;
	public String state;
	public String privacy;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String end_time;
	public String topic;
	public CopyrightModel _copyright;
	public String logo;
	public String timezone;
	public String name;
	public String background_image;
	public CreatorModel _creator;
	public String start_time;
	public String location_name;
	public VersionModel _version;
	public String type;
	public int id;
	public String email;
	public String code_of_conduct;

	public RootModel(ArrayList<Social_linksModel> social_links, String description, String organizer_description, String state, String privacy, String organizer_name, Call_for_papersModel call_for_papers, String schedule_published_on, String end_time, String topic, CopyrightModel copyright, String logo, String timezone, String name, String background_image, CreatorModel creator, String start_time, String location_name, VersionModel version, String type, int id, String email, String code_of_conduct) {

		this.social_links = social_links;
		this.description = description;
		this.organizer_description = organizer_description;
		this.state = state;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.topic = topic;
		this._copyright = copyright;
		this.logo = logo;
		this.timezone = timezone;
		this.name = name;
		this.background_image = background_image;
		this._creator = creator;
		this.start_time = start_time;
		this.location_name = location_name;
		this._version = version;
		this.type = type;
		this.id = id;
		this.email = email;
		this.code_of_conduct = code_of_conduct;

	}

}