import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public int id;
	public String code_of_conduct;
	public String timezone;
	public String name;
	public String organizer_name;
	public CreatorModel _creator;
	public String organizer_description;
	public String location_name;
	public String privacy;
	public String description;
	public String start_time;
	public String logo;
	public String end_time;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String state;
	public String topic;
	public String type;
	public String email;

	public RootModel(Call_for_papersModel call_for_papers, int id, String code_of_conduct, String timezone, String name, String organizer_name, CreatorModel creator, String organizer_description, String location_name, String privacy, String description, String start_time, String logo, String end_time, String schedule_published_on, CopyrightModel copyright, String background_image, ArrayList<Social_linksModel> social_links, VersionModel version, String state, String topic, String type, String email) {

		this._call_for_papers = call_for_papers;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.name = name;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.privacy = privacy;
		this.description = description;
		this.start_time = start_time;
		this.logo = logo;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.background_image = background_image;
		this.social_links = social_links;
		this._version = version;
		this.state = state;
		this.topic = topic;
		this.type = type;
		this.email = email;

	}

}