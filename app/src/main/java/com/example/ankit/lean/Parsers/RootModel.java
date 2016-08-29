import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String code_of_conduct;
	public String email;
	public String location_name;
	public String schedule_published_on;
	public String end_time;
	public String type;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public CreatorModel _creator;
	public String logo;
	public CopyrightModel _copyright;
	public String topic;
	public String description;
	public int id;
	public String organizer_name;
	public String name;
	public String timezone;
	public String organizer_description;
	public String privacy;
	public String background_image;

	public RootModel(Call_for_papersModel call_for_papers, String start_time, String code_of_conduct, String email, String location_name, String schedule_published_on, String end_time, String type, String state, ArrayList<Social_linksModel> social_links, VersionModel version, CreatorModel creator, String logo, CopyrightModel copyright, String topic, String description, int id, String organizer_name, String name, String timezone, String organizer_description, String privacy, String background_image) {

		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.type = type;
		this.state = state;
		this.social_links = social_links;
		this._version = version;
		this._creator = creator;
		this.logo = logo;
		this._copyright = copyright;
		this.topic = topic;
		this.description = description;
		this.id = id;
		this.organizer_name = organizer_name;
		this.name = name;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.background_image = background_image;

	}

}